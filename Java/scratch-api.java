BurrowClient cl = new HttpClient("localhost", 8080);

Future<List<Account>> alistf = cl.getAccounts().filter("limit", 1).executeAsync();
String body = "My Body ";
// Do something "useful" while waiting.
for(int i = 0; i < 100; i++)
  body = body + body;

// first .get() is the future, blocking until the response is received.
Account a = alistf.get().get(0); 
// This blocks immediately.
Queue q = a.getQueues().filter("limit", 1).execute().get(0);

Future<?> pf = q.createMessage("myid", body).attribute("ttl", 6000).executeAsync();
Future<Message> gf = q.getMessage("myid").executeAsync();


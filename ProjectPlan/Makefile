plan: java-pert c-pert
	pdflatex -interaction batchmode -file-line-error -o ProjectPlan.pdf plan.tex

java-pert:
	dot -Tpdf -Grankdir="LR" -o java-pert.pdf Java-PERT.dot

c-pert:
	echo derp
	#dot -Tpdf -o c-pert.pdf C-PERT.dot


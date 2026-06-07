JVC = javac -d out src/main/java/com/app/Main.java src/main/java/com/model/*.java src/main/java/com/service/*.java
JV = java -cp out main.java.com.app.Main src/main/java/com/app/Main.java

compile:
	$(JVC)

run:
	$(JV)

.PHONY:	compile	run	copyToFolder
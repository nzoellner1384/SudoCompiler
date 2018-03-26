file=$1
type=".java"
java -jar SudoCompiler.jar ${file}
file="${file/.n/$type}"
javac ${file}
echo Finished!

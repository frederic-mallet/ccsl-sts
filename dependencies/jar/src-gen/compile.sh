if [ "$#" -ne 1 ]; then
  echo "try . ./compile.sh Lcsafe"
else
  javac -d ../bin -cp ../lccsl-core.jar lccsl/$1.java
fi

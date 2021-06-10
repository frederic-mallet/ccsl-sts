if [ "$#" -ne 1 ]; then
  echo "try . ./run.sh Lcsafe"
else
  java -cp ../bin/:../lccsl-core.jar lccsl.$1
fi

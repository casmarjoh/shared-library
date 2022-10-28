def build (){
    echo "voy aqui"
    sh "mvn -B -DskipTests clean package"
}

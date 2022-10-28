def build (maven){
    echo "voy aqui"
    sh "mvn -B -DskipTests clean package"
}

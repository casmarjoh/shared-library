def build (Map params){
    sh "mvn -B -DskipTests clean package"
}
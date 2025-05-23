def call(){
stage("maven install"){
sh 'mvn clean install'
}
}

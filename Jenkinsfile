pipeline {
agent any
stages{
stage("git cloning"){
steps{
 git branch: 'main', url: 'https://github.com/shaikkhaleedaazhari/java-jenkins.git'

}
}
stage("maven install"){
when {
  branch 'main'
}
steps{

script{
sh 'mvn clean install'
}
}

}
}
}


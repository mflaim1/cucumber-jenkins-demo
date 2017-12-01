node{
  stage ('Build') {

   checkout scm
    withMaven(
        maven: 'M3',
        mavenSettingsConfig: 'd9ac0a9c-9530-4215-bafb-017b0409f02e',
        mavenLocalRepo: '~/.m2/repository') {
 	      sh "mvn clean install -DskipTests"

    }
  }

  stage ('Test') {

   checkout scm
    withMaven(
        maven: 'M3',
        mavenSettingsConfig: 'd9ac0a9c-9530-4215-bafb-017b0409f02e',
        mavenLocalRepo: '~/.m2/repository') {
        sh "mvn test"

    }
  }
}

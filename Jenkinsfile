pipeline{
  agent any
  tools {
    maven 'Maven 3.3.9'
  }
  stages{
    stage ('Initialize'){
      steps{
        sh '''
          echo "PATH=${PATH}"
          echo "M2_HOME=${M2_HOME}"
          '''
      }
    }
    stage ('Build') {
      steps{
        sh "mvn -DskipTests clean package"

      }
    }

    stage ('Test') {
      steps{
        sh "mvn test"

      }
    }

    stage('Deliver'){
      steps{
        sh "mvn jar:jar install:install"

      }
    }
  }
}

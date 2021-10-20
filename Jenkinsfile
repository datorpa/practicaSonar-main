node {
    // Mark the code checkout 'stage'....
    stage('Checkout') {
     checkout scm
    }

    stage('Configure'){
      echo "${tool 'maven'}"
      env.PATH = "${tool 'maven'}/bin:${env.PATH}"
    }

    // Mark the code build 'stage'....
    stage('Build') {
        // Run the maven build
        // sh "mvn clean verify -Dmaven.test.failure.ignore=true"
        sh "mvn -e clean verify"
    }

    stage('Analysis') {
      withSonarQubeEnv('sonarqube') {
        sh "mvn sonar:sonar"
      }
    }
}

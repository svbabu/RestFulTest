
node('windows'){ 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               bat 'mvn clean install' 
            }
        }
    }
}


node{ 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}

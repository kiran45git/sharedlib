def call() {   
    def mavenCommand = 'mvn package -DskipTests=true' 
     sh script:mavenCommand, returnStatus: true
    
}

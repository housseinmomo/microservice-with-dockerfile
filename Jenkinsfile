node { 

        // On definie nos variable d'environnement 
        def registeryProject = "registry.gitlab.com/abdoulfatah12/mugen-project"
        def imageProject = "${registeryProject}:version-${env.BUILD_ID}"
        def img
    
        stage('checkout') {
            checkout scm
        }
            
        stage("Build-images") {
            sh 'docker-compose up'
        }
}

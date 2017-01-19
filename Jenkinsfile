node {
    stage('Preparation') {
        git 'https://github.com/gsach/HerokuTest'
    }
    stage('Build') {
        sh "./gradlew clean test"
    }
    stage('Deploy') {
        sh "git push https://git.heroku.com/still-spire-87300.git master"
    }
}

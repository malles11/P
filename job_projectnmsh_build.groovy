def gitUrl = 'https://github.com/malles11/Wave2018.git'

job('PROJ-nmsh-tests') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}

def gitUrl = 'git://github.com/jenkinsci/job-dsl-plugin.git'

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

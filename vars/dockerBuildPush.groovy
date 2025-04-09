def call(String imageName, String tag, String dockerfilePath = '.') {
    sh "docker build -t ${imageName}:${tag} ${dockerfilePath}"
    sh "docker push ${imageName}:${tag}"
}

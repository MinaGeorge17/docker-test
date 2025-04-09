def call(String imageName, String tag, String dockerfilePath = '.') {
    // Build Docker image
    sh "docker build -t ${imageName}:${tag} ${dockerfilePath}"
    // Push to Docker Hub
    sh "docker push ${imageName}:${tag}"
}

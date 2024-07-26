# Jenkins centos
# To install jenkins
sudo yum -y install wget curl

sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
# to install java
yum install java-17-openjdk.x86_64 -y
# To install jenkins
yum install jenkins -y
# To start jekins
systemctl start jenkins
# To check status
systemctl status jenkins
# copy the ip address 
http://34.30.60.47:8080/
# Password will be in this location
cat /var/lib/jenkins/secrets/initialAdminPassword


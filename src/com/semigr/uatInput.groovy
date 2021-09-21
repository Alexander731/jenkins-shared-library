package com.semigr

public class uatInput {

  def buildIsUatApproved() {
    def file = new File("/var/lib/jenkins/approved.txt")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}
package com.tim

class Downloader {
  Date dateCreated
  String address
  InstallerType type

  static constraints = {
    address blank:false,size:5..255
  }

}

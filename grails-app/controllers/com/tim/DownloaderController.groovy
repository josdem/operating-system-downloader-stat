package com.tim

class DownloaderController {
  DownloaderService downloaderService

  def downloadUbuntuVersion(){
    downloaderService.createUbuntuStat()
  }
}

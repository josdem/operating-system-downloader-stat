package com.tim

class DownloaderController {
  def DownloaderService downloaderService

  def downloadUbuntuVersion(){
    downloaderService.createUbuntuStat(request.getRemoteAddr())
  }
}

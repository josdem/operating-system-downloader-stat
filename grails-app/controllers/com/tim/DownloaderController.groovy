package com.tim

class DownloaderController {
  def DownloaderService downloaderService

  def downloadUbuntuVersion(){
    downloaderService.createUbuntuStat(request.getRemoteAddr())

    def file = new File("/home/josdem/.jmetadata/JMetadata.deb")
    response.setContentType("application/octet-stream")
    response.setHeader("Content-disposition","attachment;filename=${file.getName()}")
    response.outputStream << file.newInputStream()
  }
}

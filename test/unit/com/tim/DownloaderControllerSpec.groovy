package com.tim

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DownloaderController)
class DownloaderControllerSpec extends Specification {
  DownloaderService downloaderService = Mock(DownloaderService)
  String address = "127.0.0.1"

  def setup(){
    controller.downloaderService = downloaderService
  }

  void "should count ubuntu download"() {
  when:
    controller.downloadUbuntuVersion()
  then:
    1 * downloaderService.createUbuntuStat(address)
    response.contentType == "application/octet-stream"
    response.getHeader("Content-disposition") == "attachment;filename=JMetadata.deb"
  }
}

package com.tim

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DownloaderController)
class DownloaderControllerSpec extends Specification {
  DownloaderService downloaderService = Mock(DownloaderService)

  def setup(){
    controller.downloaderService = downloaderService
  }

  void "should count ubuntu download"() {
  when:
    controller.downloadUbuntuVersion()
  then:
    1 * downloaderService.createUbuntuStat()
  }
}

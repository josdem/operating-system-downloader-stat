package com.tim

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(DownloaderController)
class DownloaderControllerSpec extends Specification {

  void "should count ubuntu"() {
  when:
    controller.downloadUbuntuVersion()
  then:
    response.text == "OK"
  }
}

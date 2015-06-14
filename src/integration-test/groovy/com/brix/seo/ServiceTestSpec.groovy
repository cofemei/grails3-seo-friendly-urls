package com.brix.seo


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class ServiceTestSpec extends Specification {

    void "String dynamic method is injected"() {
        expect:""
        	"The Lord of the Rings".asFriendlyUrl() == "the-lord-of-the-rings"
    }
}

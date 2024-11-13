package justserve.helpcenter

import io.micronaut.core.async.annotation.SingleResult
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Header
import io.micronaut.http.annotation.Headers
import io.micronaut.http.annotation.Post
import io.micronaut.http.client.annotation.Client
import justserve.helpcenter.model.LeadNameRequest
import justserve.helpcenter.model.LeadNameResponse

@Client(id = "email")
@Headers(
    Header("User-Agent: JustServe HelpCenter Micronaut Client"),
    Header("Accept: application/json, text/plain, */*"),
    Header("Accept-Language: en-US,en;q=0.5"),
    Header("Accept-Encoding: gzip, deflate, br, zstd"),
    Header("Referer: https://www.justserve.org/about"),
    Header("Content-Type: application/json"),
//    Header("Content-Length: 34"),
    Header("Origin: https://www.justserve.org"),
//    Header("Connection: keep-alive"),
    Header("Cookie: NEXT_LOCALE=en-us; dtCookie=v_4_srv_4_sn_2A20A62B78C64091E194E42F189DE1B5_perc_100000_ol_0_mul_1_app-3A8ada1280bee91d29_1_rcs-3Acss_1"),
    Header("Sec-Fetch-Dest: empty"),
    Header("Sec-Fetch-Mode: cors"),
    Header("Sec-Fetch-Site: same-origin"),
    Header("Priority: u=0")
)
interface EmailApiClient {

    @Post("/contact/leadName")
    @SingleResult
    fun requestLeadName(@Body leadNameRequest: LeadNameRequest): LeadNameResponse
}
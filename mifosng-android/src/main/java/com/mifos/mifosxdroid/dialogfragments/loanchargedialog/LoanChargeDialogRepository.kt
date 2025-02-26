package com.mifos.mifosxdroid.dialogfragments.loanchargedialog

import com.mifos.objects.client.ChargeCreationResponse
import com.mifos.services.data.ChargesPayload
import okhttp3.ResponseBody
import rx.Observable

/**
 * Created by Aditya Gupta on 16/08/23.
 */
interface LoanChargeDialogRepository {

    fun getAllChargesV3(loanId: Int): Observable<ResponseBody>

    fun createLoanCharges(
        loanId: Int,
        chargesPayload: ChargesPayload?
    ): Observable<ChargeCreationResponse>
}
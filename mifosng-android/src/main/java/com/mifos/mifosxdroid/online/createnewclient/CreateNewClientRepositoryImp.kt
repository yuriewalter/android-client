package com.mifos.mifosxdroid.online.createnewclient

import com.mifos.api.datamanager.DataManagerClient
import com.mifos.api.datamanager.DataManagerOffices
import com.mifos.api.datamanager.DataManagerStaff
import com.mifos.objects.client.Client
import com.mifos.objects.client.ClientPayload
import com.mifos.objects.organisation.Office
import com.mifos.objects.organisation.Staff
import com.mifos.objects.templates.clients.ClientsTemplate
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import rx.Observable
import javax.inject.Inject

/**
 * Created by Aditya Gupta on 10/08/23.
 */
class CreateNewClientRepositoryImp @Inject constructor(
    private val dataManagerClient: DataManagerClient,
    private val dataManagerOffices: DataManagerOffices,
    private val dataManagerStaff: DataManagerStaff
) : CreateNewClientRepository {

    override fun clientTemplate(): Observable<ClientsTemplate> {
        return dataManagerClient.clientTemplate
    }

    override fun offices(): Observable<List<Office>> {
        return dataManagerOffices.offices
    }

    override fun getStaffInOffice(officeId: Int): Observable<List<Staff>> {
        return dataManagerStaff.getStaffInOffice(officeId)
    }

    override fun createClient(clientPayload: ClientPayload): Observable<Client> {
        return dataManagerClient.createClient(clientPayload)
    }

    override fun uploadClientImage(id: Int, file: MultipartBody.Part?): Observable<ResponseBody> {
        return dataManagerClient.uploadClientImage(id, file)
    }

}
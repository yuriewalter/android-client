package com.mifos.mifosxdroid.online.grouplist

import com.mifos.objects.group.CenterWithAssociations
import com.mifos.objects.group.GroupWithAssociations
import rx.Observable

/**
 * Created by Aditya Gupta on 06/08/23.
 */
interface GroupListRepository {

    fun getGroups(groupId: Int): Observable<GroupWithAssociations>

    fun getGroupsByCenter(id: Int): Observable<CenterWithAssociations>

}
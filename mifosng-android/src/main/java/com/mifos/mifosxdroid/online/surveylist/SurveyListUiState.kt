package com.mifos.mifosxdroid.online.surveylist

import com.mifos.objects.survey.Survey

/**
 * Created by Aditya Gupta on 08/08/23.
 */
sealed class SurveyListUiState {

    object ShowProgressbar : SurveyListUiState()

    data class ShowFetchingError(val message: Int) : SurveyListUiState()

    data class ShowAllSurvey(val syncSurvey: List<Survey>) : SurveyListUiState()
}
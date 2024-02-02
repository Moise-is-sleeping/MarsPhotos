
package com.example.marsphotos.data



interface MarsPhotosRepository {
    suspend fun getMarsPhoto(): List<MarsPhoto>
}
class NetworkMarsPhotosRepository(
    private val marsApiService: MarsApiService
) : MarsPhotosRepository {
    override suspend fun getMarsPhoto(): List<MarsPhoto> = marsApiService.getPhotos()
}

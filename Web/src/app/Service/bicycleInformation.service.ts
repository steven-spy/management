import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";


@Injectable()
export class BicycleInformationService {

  constructor(
    private http: HttpClient
  ) {
  }

  getBicycleCount() {
    return this.http.get('/Bicycle/getBicycleCount');
  }

  getAllWithPaging(pageSize: number, pageCount: number) {
    return this.http.get('/Bicycle/getAllWithPaging?pageSize=' + pageSize + '&pageCount=' + pageCount);
  }

  getAppointBicycleTrack(data: any) {
    return this.http.get('/BicycleTrack/getAppointBicycleTrack?btBicycleName=' + data);
  }
}

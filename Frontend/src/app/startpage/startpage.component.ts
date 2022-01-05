import { Component, OnInit } from '@angular/core';
import { PackageService } from '../package.service';

@Component({
  selector: 'app-startpage',
  template: `
    <p>
      {{this.packet}}
    </p>
  `,
  styles: [
  ]
})
export class StartpageComponent implements OnInit {

  packet = "";

  constructor(private packageService: PackageService) { }

  ngOnInit() {

    this.packageService.sendGetRequest().subscribe((data: any)=>{
      this.packet = data;
    })
 
  }

}

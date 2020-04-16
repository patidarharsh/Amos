import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AllProductsComponent } from './components/all-products/all-products.component';
import { CategoryProductsComponent } from './components/category-products/category-products.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';


const routes: Routes = [
  {path: '', component: HomeComponent },
  {path: 'home', component: HomeComponent},
  {path: 'all-products', component: AllProductsComponent},
  {path: 'category', component: CategoryProductsComponent},
  {path: 'product-details', component: ProductDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

// import {Injectable} from "@angular/core";
// import {ActivatedRouteSnapshot, Resolve, RouterStateSnapshot} from "@angular/router";
// import {Recipe} from "../recipe.model";
// import {Observable} from "rxjs";
// import {DataStorageService} from "../../shared/service/data-storage.service";
// import {RecipeService} from "../service/recipe.service";
//
// @Injectable({providedIn: 'root'})
// export class RecipesResolverService implements Resolve<Recipe[]> {
//
//   constructor(private dataStorageService: DataStorageService, private recipeService: RecipeService) {
//   }
//
//   resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
//     let recipes = this.recipeService.getRecipes();
//     if (recipes.length === 0) {
//       return this.dataStorageService.fetchRecipes();
//     }
//     return recipes;
//   }
// }

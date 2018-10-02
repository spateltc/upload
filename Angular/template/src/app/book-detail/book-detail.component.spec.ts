<div class="buildings-wrapper">    //div closing illa 
<div class="header-content col-md-12">
   <span class="pull-left">Buildings</span>
   <span class="pull-right">{{currentLocation?.addressLine1}}</span>
</div>


<form>
//Building Limit textbox

<div class="form-input col-left-padding col-md-6">
   <div class="form-group" [ngClass]="{'has-error':isError}">
         <label  class="optional-field">
         <span style="font-weight: bold;">Building Limit</span>
         </label>
         <input type="text" maxlength="10" class="form-control">
   </div>
</div>




///valuation dropdown

<div class="form-input col-left-padding col-md-6">
   <div class="form-select">
      <div class="form-group">
         <label for="usr">Valuation</label>
         <select class="form-control" id="dropdown">
            <option>Replacement Cost</option>
            <option>option 1</option>
            <option>option 2</option>
            <option>option 3</option>
            <option>option 4</option>
            <option>option 5</option>
         </select>
      </div>
   </div>
</div>




//Year Built

<div class="form-input col-left-padding col-md-6">
   <div class="form-group" [ngClass]="{'has-error':isError}">
     
         <label  class="optional-field">
         <span style="font-weight: bold;">Year Built</span>
         </label>
         <input type="text" maxlength="10" class="form-control">
   </div>
</div>





//year Upgraded
<div class="form-input col-left-padding col-md-6">
   <div class="form-group" [ngClass]="{'has-error':isError}">
     
         <label  class="optional-field">
         <span >Year Upgraded</span>
         </label>
         <input type="text" maxlength="10" class="form-control">
   </div>
</div>





//Radio Button 

//radio button 
<div class="booleanQuestion clearfix">
   <div class="row-content">
      <div class="col-md-8 col-lg-8 col-sm-8 padding-left-10 margin-top-2">
         <p>Automatic sprinkler system</p>
      </div>
      <div class="col-md-2 col-sm-2">
         <div class="radio gird-radio-padding">
            <input type="radio" name="mobile" id="mobile" value="true" [disabled]="isRetrieveFlag" (change)="changePhonePattern(true)" [checked]="isPhoneNumberPattern==true">
            <label for="mobile">
            <span class="radio">Yes</span>
            </label>
         </div>
      </div>
      <div class="col-md-2 col-sm-2">
         <div class="radio gird-radio-padding">
            <input type="radio" name="mobile" id="business" value="false" [disabled]="isRetrieveFlag" (change)="changePhonePattern(false)" [checked]="isPhoneNumberPattern==false">
            <label for="business">
            <span class="radio">No</span>
            </label>
         </div>
      </div>
   </div>

</div>

 
  
  
  
  



//radio button 
<div class="booleanQuestion clearfix">
   <div class="row-content">
      <div class="col-md-8 col-lg-8 col-sm-8 padding-left-10 margin-top-2">
         <p>Percent Occupied by owner?</p>
      </div>
      <div class="col-md-2 col-sm-2">
         <div class="radio gird-radio-padding">
            <input type="radio" name="mobile" id="mobile" value="true" [disabled]="isRetrieveFlag" (change)="changePhonePattern(true)" [checked]="isPhoneNumberPattern==true">
            <label for="mobile">
            <span class="radio">Over 10%</span>
            </label>
         </div>
      </div>
      <div class="col-md-2 col-sm-2">
         <div class="radio gird-radio-padding">
            <input type="radio" name="mobile" id="business" value="false" [disabled]="isRetrieveFlag" (change)="changePhonePattern(false)" [checked]="isPhoneNumberPattern==false">
            <label for="business">
            <span class="radio">Under 10%</span>
            </label>
         </div>
      </div>
   </div>

</div>



<app-accordion [disabled]="false" [isOpen]="false" [isModified]="true" [title]="'Standard Buildding Coverages'" >
   
   //dropdown
   
   <div class="form-input col-left-padding col-md-6">
      <div class="form-select">
         <div class="form-group">
            <label for="usr">Auto Increases in Insurance</label>
            <select class="form-control" id="dropdown">
               <option>2%</option>
               <option>option 1</option>
               <option>option 2</option>
               <option>option 3</option>
               <option>option 4</option>
               <option>option 5</option>
            </select>
         </div>
      </div>
   </div>




//Business personal property 
   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">
         
            <label  class="optional-field">
            <span style="font-weight: bold;">Business personal property</span>
            </label>
            <input type="text" maxlength="10" class="form-control">
      </div>
   </div>



//Business personal Property Limit - Seasonal
   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">
         
            <label  class="optional-field">
            <span style="font-weight: bold;">Business personal Property Limit - Seasonal</span>
            </label>
            <input type="text" maxlength="10" class="form-control"            >
         
      </div>
   </div>





//Liability Coverage damaged to premises
   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">

            <label  class="optional-field">
            <span style="font-weight: bold;">Liability Coverage damaged to premises</span>
            </label>
            <input type="text" maxlength="10" class="form-control"            >
      </div>
   </div>





//Newly acquired or Constructed Property
   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">
            <label  class="optional-field">
            <span style="font-weight: bold;">Newly acquired or Constructed Property</span>
            </label>
            <input type="text" maxlength="10" class="form-control">
      </div>
   </div>



</app-accordion>




//Additional Building Coverages

   <app-accordion [disabled]="false" [isOpen]="false" [isModified]="true" [title]="'Additional Building Coverages'" >
   <div class="form-input col-left-padding col-md-12">
      <div class="form-group" [ngClass]="{'has-error':isError}">
        
            <label  class="optional-field">
            <span >Additional Building Coverages</span>
            </label>
            <input type="text" maxlength="10" class="form-control"            >
        
      </div>
   </div>
   </app-accordion>










// classification coverage     //form used for type ahead 



<app-accordion [disabled]="false" [isOpen]="true" [isModified]="false" [title]="'Classifications'" >
   




   <div class="typeAheadContainer col-md-12 col-lg-12 col-sm-12 padding-left-10 padding-right-2 padding-bottom-1">
      <form>
         <app-type-ahead [tooltip]="classInfoHelp" [placeholder]="'Classification Description'" [options]="classificationsArray" [controlForm]="nanForm"
         [typeaheadScrollable]="true" [typeaheadOptionsInScrollableView]="5" (selectEvent)="retrieveQuestions($event)" (keyUpEvent)="typeAheadKeyUp($event)"></app-type-ahead>
      </form>
   </div>





   <div class="booleanQuestion clearfix">
      <div class="row-content">
         <div class="col-md-8 col-lg-8 col-sm-8 padding-left-10 margin-top-2">
            <p>Was an policy declined or coverage declined,cancelled,or Non renewed during the prior 3 years for underwriting reasons or for mid-term non payment</p>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="mobile" value="true" [disabled]="isRetrieveFlag" (change)="changePhonePattern(true)" [checked]="isPhoneNumberPattern==true">
               <label for="mobile">
               <span class="radio">Yes</span>
               </label>
            </div>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="business" value="false" [disabled]="isRetrieveFlag" (change)="changePhonePattern(false)" [checked]="isPhoneNumberPattern==false">
               <label for="business">
               <span class="radio">No</span>
               </label>
            </div>
         </div>
      </div>
   </div>






   <div class="booleanQuestion clearfix">
      <div class="row-content">
         <div class="col-md-8 col-lg-8 col-sm-8 padding-left-10 margin-top-2">
            <p>Has the applicant's restaurant business been with the same owner for at least 3 years?</p>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="mobile" value="true" [disabled]="isRetrieveFlag" (change)="changePhonePattern(true)" [checked]="isPhoneNumberPattern==true">
               <label for="mobile">
               <span class="radio">Yes</span>
               </label>
            </div>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="business" value="false" [disabled]="isRetrieveFlag" (change)="changePhonePattern(false)" [checked]="isPhoneNumberPattern==false">
               <label for="business">
               <span class="radio">No</span>
               </label>
            </div>
         </div>
      </div>
   </div>




   <div class="booleanQuestion clearfix">
      <div class="row-content">
         <div class="col-md-8 col-lg-8 col-sm-8 padding-left-10 margin-top-2">
            <p>Does the applicant have a dance floor,Live Entertainment(other than a piano) or children's play area </p>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="mobile" value="true" [disabled]="isRetrieveFlag" (change)="changePhonePattern(true)" [checked]="isPhoneNumberPattern==true">
               <label for="mobile">
               <span class="radio">Yes</span>
               </label>
            </div>
         </div>
         <div class="col-md-2 col-sm-2">
            <div class="radio gird-radio-padding">
               <input type="radio" name="mobile" id="business" value="false" [disabled]="isRetrieveFlag" (change)="changePhonePattern(false)" [checked]="isPhoneNumberPattern==false">
               <label for="business">
               <span class="radio">No</span>
               </label>
            </div>
         </div>
      </div>
   </div>


//sales amount 

   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">
            <label  class="optional-field">
            <span >Sales Amount</span>
            </label>
            <input type="text" maxlength="10" class="form-control">
      </div>
   </div>




//square footage
   <div class="form-input col-left-padding col-md-6">
      <div class="form-group" [ngClass]="{'has-error':isError}">
        
            <label  class="optional-field">
            <span >Square Footage</span>
            </label>
            <input type="text" maxlength="10" class="form-control"            >
        
      </div>
   </div>




//check box

   <div class="col-left-padding col-md-7 ">
      <div class="form-group" [ngClass]="{'has-error':isError}">
         <div class="checkbox">
            <input type="checkbox" name="group2" id="fullLegalName" formControlName="fullLegalNameCheckBox" #legalName (change)="clickFullLegal(legalName.checked)">
            <label for="fullLegalName">
            <span class="checkbox">Business Personal Property Limit</span>
            </label>
         </div>
      </div>
   </div>

   //normal text box 
   <div class="form-input col-left-padding col-md-5">
      <div class="form-group" [ngClass]="{'has-error':isError}">
         <form >
            <label  class="optional-field">
            <span >Limit</span>
            </label>
            <input type="text" maxlength="10" class="form-control"            >
         </form>
      </div>
   </div>





   </app-accordion>
  


































</form>
</div>

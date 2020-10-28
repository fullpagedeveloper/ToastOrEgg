# ToastOrEgg


![Artboard 1@4x](https://user-images.githubusercontent.com/60374847/97440448-0f565800-195a-11eb-81fa-861249e6218a.png)







[![](https://jitpack.io/v/fullpagedevelopers/ToastOrEgg.svg)](https://jitpack.io/#fullpagedevelopers/ToastOrEgg)


## Prerequisites

    allprojects {
        repositories {
          ...
          maven { url 'https://jitpack.io' }
        }
      }
  
## Dependency

Add this to your module's build.gradle file (make sure the version matches the JitPack badge above):


      dependencies {
                implementation 'com.github.fullpagedevelopers:ToastOrEgg:1.0'
        }

## Usage

  ### duration: 0 Long
  
  
  ### duration: 1 short

  original toast by changing the background
  
    toastOrEgg( "Anjayyyyy", 1, R.color.design_default_color_primary_variant)
  
  
  to toast all attributes
 
  
    toastOrEgg( "Gokilllll", 0, R.color.black, R.color.white, R.drawable.ic_baseline_lock_24)
  
  
  
  for toast do not use color
  
    toastOrEgg( "Gokilllll", 0, null, null, R.drawable.ic_baseline_lock_24)
  
  
  
  for toast does not use image
  
    toastOrEgg( "Gokilllll", 0, R.color.black, R.color.white,null)

  
  
  for fragments you can use an activity
  
     activity?.toastOrEgg("hahahah", 0, R.color.black, R.color.white, R.drawable.ic_baseline_check_24)
  
  
  
  ## ScreenShoot
  
  <img width="288" alt="Screen Shot 2020-10-28 at 13 14 45" src="https://user-images.githubusercontent.com/60374847/97402646-786fa880-1925-11eb-8826-fd1e9396eb2a.png">
<img width="293" alt="Screen Shot 2020-10-28 at 13 14 26" src="https://user-images.githubusercontent.com/60374847/97402651-7ad20280-1925-11eb-97f8-ceee011eeefc.png">
<img width="302" alt="Screen Shot 2020-10-28 at 13 14 08" src="https://user-images.githubusercontent.com/60374847/97402653-7ad20280-1925-11eb-983b-ee15cda23fcc.png">
<img width="281" alt="Screen Shot 2020-10-28 at 13 13 50" src="https://user-images.githubusercontent.com/60374847/97402735-9e954880-1925-11eb-8acf-4888d5dbd669.png">

  

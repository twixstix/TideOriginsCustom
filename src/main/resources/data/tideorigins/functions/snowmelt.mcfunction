execute store result score MeltTest DidMelt run fill ~-1 ~-1 ~-1 ~1 ~1 ~1 minecraft:air replace #minecraft:snow
execute if score MeltTest DidMelt matches 1.. run playsound minecraft:block.lava.extinguish ambient @a[distance=..20]
execute store result score MeltTest DidMelt2 run fill ~-1 ~-1 ~-1 ~1 ~1 ~1 minecraft:water replace minecraft:ice
execute if score MeltTest DidMelt2 matches 1.. run playsound minecraft:block.lava.extinguish ambient @a[distance=..20]
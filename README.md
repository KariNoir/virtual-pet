# virtual-pet


I want my pet to eat, potty, sleep, and play;

Play reduces sleep and eat and drink;

Eat increases Sleep (energy) by 1;
Eat decrease Potty by 4;
If Eat is less than 6 then Hungry;

Sleep decreases Potty by 2;
Sleep increase Food by 2;
If Sleep is less than 6 then tired;

Play decrease Sleep by 3;
Play decrease Eat by 2;
If Play is less than 6 then sad;

Potty increases Play by 2;
Potty decrease Eat by 2;
If Potty is less than 6 then need go;

Max sleep 10;
Max Eat 10;
Max Potty 10;
Max Play 10;

Every 20 seconds all instances decrease by 1; 
If Sleep is 0 then dead;
If Eat is 0 for 20 seconds then dead;

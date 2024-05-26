Objectives:
Create	an	application	from	scratch	that	periodically	reminds	the	user	to	take	a	selfie - a	picture	of	one's	
self	taken	from	one's	device. Over	time	the	user	will	capture	many	selfies	and	thus	will	be	able	to	see	
him	or	herself	change	over	some	period	of	time.

Requirement	#1:	
If	the	user	clicks	on	the	camera	icon	on	the	ActionBar,	the	app	will	open	up	a	picture-taking	app	already	
installed	on	the	device.	

Requirement	#2:	
If	the	user	snaps	a	picture	and	accepts	it,	the	picture	is	returned	to	the	DailySelfie	
app	and	then	displayed	in	some	way	to	the	user along	with	other	selfies	the	user	may	have	already	
taken. The	user	should	be	able	eventually	see	a	small	view	for	each	selfie.	

Requirement	#3:	If	the	user	clicks	on	the	small	view,	then	a	large	view	will	open	up,	showing	the	selfie in	
a	larger	format. There	must	be	a	way	to	go	from	a	small	view	to	a	large	view	and	then	back	to	the	original	small	view.

Requirement	#4: 
Whenever the	user	takes	a	selfie,	the	image	data	must	be	stored	in	some	permanent	way.	
In	particular,	if	the	user	exits	the	app	and	then	reopens	it,	they	should	have	access	to all	the	selfies	
saved	on	their	device.

Requirement	#5:	
Because	the	user	wants	to	take	selfies	periodically	over	a	long	period	of	time,	the	app	should	create	and	set	
an	Alarm	that	fires	roughly	once	every	two	minutes.	In	a	real	app,	this	would	most likely	be	set	to	a	longer	period, 
such	as	once	per	day.	We	will	fire	the	alarms	roughly	every	two	minutes	to	make	assessment	easier.		
When	one	of	these alarms fires,	a	notification	area	notification	should	be	placed	in	the	notification	area, as	shown	below. 
Pulling	down	on	the	notification	drawer	should	expose	a	notification	view.
Clicking	on	this	notification	view	should	bring	the	user	back	to	the	application.

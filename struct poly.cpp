struct poly
{
int coeff;
int expo;
};
int add(poly p1[10],poly p2[10],poly p3[10],int t1,int t2)
{
int i,j,k;
int t3;
i=j=k=0;
while(i<t1 && j<t2)
{
if(p1[i].expo==p2[j].expo)
{

p3[k].coeff=p1[i].coeff+p2[j].coeff;
p3[k].expo=p1[i].expo;
i++; j++; k++;

}
if(p1[i].expo>p2[j].expo)
{

p3[k].coeff=p1[i].coeff;
p3[k].expo=p1[i].expo;
i++; k++;

}

else
{

p3[k].coeff=p2[j].coeff;
p3[k].expo=p2[j].expo;
j++; k++;

}
}
while(i<t1)
{
p3[k].coeff=p1[i].coeff;
p3[k].expo=p1[i].expo;
i++; k++;
}
while(j<t2)
{
p3[k].coeff=p2[j].coeff;
p3[k].expo=p2[j].expo;
j++; k++;
}
t3=k;
return t3;
}
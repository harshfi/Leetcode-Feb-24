select p.product_name , s.year , s.price
from Sales s
inner join Product p
On s.product_id = p.product_id
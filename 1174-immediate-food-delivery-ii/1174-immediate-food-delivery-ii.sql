select round(sum(order_date=customer_pref_delivery_date)*100/count(*),2) as immediate_percentage FROM Delivery where (customer_id,order_date) IN
(SELECT customer_id,MIN(order_date)FROM Delivery GROUP BY customer_id);


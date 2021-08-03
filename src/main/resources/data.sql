insert into user (id,created_date,email,mobile_number,name,user_type)

values (1,CURRENT_TIMESTAMP(),'abc@gmail.com','9348377388','Ram','USER_TYPE.EMPLOYEE');


insert into item (id,item_name,item_price,item_type,item_category_code)
values(1,'LG Monitor 24 Inch',12500.0,'Computer Monitor','ITEM_CATEGORY.ELECTRONICS');

insert into item (id,item_name,item_price,item_type,item_category_code)
values(2,'Musterd Oil',200.0,'Computer Monitor','ITEM_CATEGORY.GROCERIES');

insert into item (id,item_name,item_price,item_type,item_category_code)
values(3,'Reebok Shoes',7000.0,'Fashion','ITEM_CATEGORY.FASHION');

insert into item (id,item_name,item_price,item_type,item_category_code)
values(4,'Apple iPhone 11',70000.0,'Mobile','ITEM_CATEGORY.ELECTRONICS');

insert into item (id,item_name,item_price,item_type,item_category_code)
values(5,'Luminos Invertor',7000.0,'Invertor','ITEM_CATEGORY.ELECTRONICS');

insert into bill_details (id,bill_date,gross_amount,user_id)
values(1,CURRENT_TIMESTAMP(),27500.0,1);

insert into item_order(id,item_quantity,bill_id,item_order_id)

values(1,1,1,1);

insert into item_order(id,item_quantity,bill_id,item_order_id)

values(2,5,1,2);

insert into item_order(id,item_quantity,bill_id,item_order_id)

values(3,2,1,3);


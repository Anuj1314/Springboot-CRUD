Basic CRUD operation SpringBoot Project.

**Api details**

    GET: /v1/bikes/
        It will give you list of bikes
    POST: /v1/bikes/
        Need to pass payload to upload bike details.
        payload:
            
        {
            "cNo":5,
            "companyName":"yamaha",
            "bikeName":"fz-s",
            "color":"green"
        }
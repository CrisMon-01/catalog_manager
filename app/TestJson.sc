import it.gov.***REMOVED***.catalogmanager.MetaCatalog
import it.gov.***REMOVED***.catalogmanager._

import it.gov.***REMOVED***.catalogmanager.json._

import play.api.libs.ws._

import play.api.libs.json._

import javax.inject._


val json = s"""{
    "dataschema": {
        "avro": {
            "name": "bike_sharing",
            "type": "record",
            "namespace": "***REMOVED***://***REMOVED***-test2/ENVI/bike_sharing",
            "alliases": null,
            "fields": [
                {
                    "name": "Utente_Bike_Sharing",
                    "type": "string"
                },
                {
                    "name": "Data_Inizio",
                    "type": "string"
                },
                {
                    "name": "Stazione_prelievo",
                    "type": "string"
                },
                {
                    "name": "Data_Fine",
                    "type": "string"
                },
                {
                    "name": "Stazione_restituzione",
                    "type": "string"
                },
                {
                    "name": "Tempo_Totale",
                    "type": "string"
                },
                {
                    "name": "Costo",
                    "type": "float"
                }
            ]
        },
        "flatSchema": [
            {
                "name": "Utente_Bike_Sharing",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Data_Inizio",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Stazione_prelievo",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Data_Fine",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Stazione_restituzione",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Tempo_Totale",
                "type": "string",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            },
            {
                "name": "Costo",
                "type": "float",
                "metadata": {
                    "semantics": {
                        "id": "",
                        "context": ""
                    },
                    "desc": "",
                    "tag": "",
                    "field_type": "",
                    "constr": [
                        {
                            "type": "",
                            "param": ""
                        }
                    ],
                    "required": 0,
                    "cat": ""
                }
            }
        ]
    },
    "operational": {
        "dataset_type": "batch",
        "input_src": "ciao",
        "read_type": "update",
        "is_std": false,
        "logical_uri": "***REMOVED***://dataset/ord/***REMOVED***-test2/***REMOVED***-test2/ENVI/bike_sharing",
        "group_own": "***REMOVED***-test2",
        "georef": null,
        "storage_info": null,
        "physical_uri": "data/***REMOVED***_testdatalake/ord/***REMOVED***-test2/ENVI/***REMOVED***-test2/bike_sharing",
        "ingestion_pipeline": null,
        "group_access": null,
        "std_schema": null
    },
    "dcatapit": {
        "name": "bike_sharing",
        "notes": "Descrizione bike sharing ",
        "organization": {
            "name": "pippo",
            "image_url": null,
            "email": null,
            "state": null,
            "description": null,
            "users": null,
            "is_organization": null,
            "id": null,
            "title": null,
            "type": null,
            "revision_id": null,
            "approval_status": null,
            "created": null
        },
        "author": null,
        "license_id": "other-nc",
        "relationships_as_object": [],
        "holder_identifier": "***REMOVED***-test2",
        "identifier": "bike_sharing",
        "license_title": "Altro (Non Commerciale)",
        "tags": [
            {
                "name": "ENVI",
                "state": "active",
                "vocabulary_id": null,
                "display_name": "ENVI",
                "id": "f5feb374-3e24-417a-969e-17f00d7e6458"
            }
        ],
        "groups": [],
        "modified": "2017-07-23",
        "alternate_identifier": "bike_sharing",
        "relationships_as_subject": [],
        "holder_name": "***REMOVED***-test2",
        "publisher_identifier": "***REMOVED***-test2",
        "resources": [],
        "frequency": "unknown",
        "title": "bike_sharing",
        "owner_org": "***REMOVED***-test2",
        "theme": "ENVI",
        "publisher_name": "***REMOVED***-test2"
    }
}"""

val b =  s"""{"a" : "a"}"""

val c = Json.parse(b)

val d = (c \ "a").get.asOpt[String]

println(d)
//val a = Json.parse(json).as[MetaCatalog]


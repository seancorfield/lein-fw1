(ns $project$.controllers.main
  (:use framework.one))

(defn default "/main/default handler" [rc]
  rc)

(defn default-view "/main/default view render" [rc nodes]
  nodes)

(defn default-layout "/main/default layout render" [rc nodes]
  nodes)

(defn layout "/main section layout render" [rc nodes]
  nodes)
